
  package gen;
  public class I_Gen54 {
  		@com.google.inject.Inject
  		public I_Gen54(I_Gen55 i_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  