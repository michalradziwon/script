
  package gen;
  public class R_Gen175 {
  		@com.google.inject.Inject
  		public R_Gen175(R_Gen176 r_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  