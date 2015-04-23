
  package gen;
  public class S_Gen41 {
  		@com.google.inject.Inject
  		public S_Gen41(S_Gen42 s_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  