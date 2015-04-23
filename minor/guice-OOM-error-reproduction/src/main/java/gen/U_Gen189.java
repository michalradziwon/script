
  package gen;
  public class U_Gen189 {
  		@com.google.inject.Inject
  		public U_Gen189(U_Gen190 u_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  