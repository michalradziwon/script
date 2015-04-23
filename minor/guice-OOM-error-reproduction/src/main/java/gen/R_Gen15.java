
  package gen;
  public class R_Gen15 {
  		@com.google.inject.Inject
  		public R_Gen15(R_Gen16 r_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  