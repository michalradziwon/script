
  package gen;
  public class S_Gen138 {
  		@com.google.inject.Inject
  		public S_Gen138(S_Gen139 s_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  