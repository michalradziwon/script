
  package gen;
  public class I_Gen178 {
  		@com.google.inject.Inject
  		public I_Gen178(I_Gen179 i_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  