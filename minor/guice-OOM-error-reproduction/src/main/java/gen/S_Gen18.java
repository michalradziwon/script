
  package gen;
  public class S_Gen18 {
  		@com.google.inject.Inject
  		public S_Gen18(S_Gen19 s_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  