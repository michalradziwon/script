
  package gen;
  public class S_Gen40 {
  		@com.google.inject.Inject
  		public S_Gen40(S_Gen41 s_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  