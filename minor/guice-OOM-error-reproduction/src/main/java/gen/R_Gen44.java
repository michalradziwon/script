
  package gen;
  public class R_Gen44 {
  		@com.google.inject.Inject
  		public R_Gen44(R_Gen45 r_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  