
  package gen;
  public class I_Gen18 {
  		@com.google.inject.Inject
  		public I_Gen18(I_Gen19 i_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  