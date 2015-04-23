
  package gen;
  public class R_Gen100 {
  		@com.google.inject.Inject
  		public R_Gen100(R_Gen101 r_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  