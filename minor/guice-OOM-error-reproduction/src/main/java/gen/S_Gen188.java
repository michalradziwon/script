
  package gen;
  public class S_Gen188 {
  		@com.google.inject.Inject
  		public S_Gen188(S_Gen189 s_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  