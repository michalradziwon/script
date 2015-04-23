
  package gen;
  public class C_Gen153 {
  		@com.google.inject.Inject
  		public C_Gen153(C_Gen154 c_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  