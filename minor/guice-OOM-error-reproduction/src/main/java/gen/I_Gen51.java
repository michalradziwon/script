
  package gen;
  public class I_Gen51 {
  		@com.google.inject.Inject
  		public I_Gen51(I_Gen52 i_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  