
  package gen;
  public class S_Gen60 {
  		@com.google.inject.Inject
  		public S_Gen60(S_Gen61 s_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  