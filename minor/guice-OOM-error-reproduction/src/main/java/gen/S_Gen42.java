
  package gen;
  public class S_Gen42 {
  		@com.google.inject.Inject
  		public S_Gen42(S_Gen43 s_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  