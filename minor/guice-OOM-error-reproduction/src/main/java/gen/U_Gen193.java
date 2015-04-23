
  package gen;
  public class U_Gen193 {
  		@com.google.inject.Inject
  		public U_Gen193(U_Gen194 u_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  