
  package gen;
  public class I_Gen193 {
  		@com.google.inject.Inject
  		public I_Gen193(I_Gen194 i_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  