
  package gen;
  public class R_Gen158 {
  		@com.google.inject.Inject
  		public R_Gen158(R_Gen159 r_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  