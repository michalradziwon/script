
  package gen;
  public class S_Gen59 {
  		@com.google.inject.Inject
  		public S_Gen59(S_Gen60 s_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  