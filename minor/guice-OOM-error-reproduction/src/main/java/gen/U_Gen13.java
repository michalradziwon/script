
  package gen;
  public class U_Gen13 {
  		@com.google.inject.Inject
  		public U_Gen13(U_Gen14 u_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  