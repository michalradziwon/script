
  package gen;
  public class R_Gen150 {
  		@com.google.inject.Inject
  		public R_Gen150(R_Gen151 r_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  