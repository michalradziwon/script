
  package gen;
  public class S_Gen11 {
  		@com.google.inject.Inject
  		public S_Gen11(S_Gen12 s_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  