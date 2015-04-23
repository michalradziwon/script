
  package gen;
  public class U_Gen153 {
  		@com.google.inject.Inject
  		public U_Gen153(U_Gen154 u_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  