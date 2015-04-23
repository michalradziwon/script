
  package gen;
  public class S_Gen51 {
  		@com.google.inject.Inject
  		public S_Gen51(S_Gen52 s_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  