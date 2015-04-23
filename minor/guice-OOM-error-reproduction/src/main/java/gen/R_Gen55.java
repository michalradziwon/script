
  package gen;
  public class R_Gen55 {
  		@com.google.inject.Inject
  		public R_Gen55(R_Gen56 r_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  