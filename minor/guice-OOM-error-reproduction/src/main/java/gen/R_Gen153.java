
  package gen;
  public class R_Gen153 {
  		@com.google.inject.Inject
  		public R_Gen153(R_Gen154 r_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  