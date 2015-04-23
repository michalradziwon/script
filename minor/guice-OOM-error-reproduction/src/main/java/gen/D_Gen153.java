
  package gen;
  public class D_Gen153 {
  		@com.google.inject.Inject
  		public D_Gen153(D_Gen154 d_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  