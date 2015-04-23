
  package gen;
  public class R_Gen159 {
  		@com.google.inject.Inject
  		public R_Gen159(R_Gen160 r_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  