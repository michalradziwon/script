
  package gen;
  public class R_Gen174 {
  		@com.google.inject.Inject
  		public R_Gen174(R_Gen175 r_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  