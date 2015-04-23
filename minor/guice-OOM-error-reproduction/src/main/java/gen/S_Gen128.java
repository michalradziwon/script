
  package gen;
  public class S_Gen128 {
  		@com.google.inject.Inject
  		public S_Gen128(S_Gen129 s_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  