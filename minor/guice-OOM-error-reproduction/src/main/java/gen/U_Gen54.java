
  package gen;
  public class U_Gen54 {
  		@com.google.inject.Inject
  		public U_Gen54(U_Gen55 u_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  