
  package gen;
  public class R_Gen22 {
  		@com.google.inject.Inject
  		public R_Gen22(R_Gen23 r_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  