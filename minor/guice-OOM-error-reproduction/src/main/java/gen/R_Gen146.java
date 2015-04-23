
  package gen;
  public class R_Gen146 {
  		@com.google.inject.Inject
  		public R_Gen146(R_Gen147 r_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  