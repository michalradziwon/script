
  package gen;
  public class R_Gen60 {
  		@com.google.inject.Inject
  		public R_Gen60(R_Gen61 r_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  