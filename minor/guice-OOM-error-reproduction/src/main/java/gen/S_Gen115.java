
  package gen;
  public class S_Gen115 {
  		@com.google.inject.Inject
  		public S_Gen115(S_Gen116 s_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  