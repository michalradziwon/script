
  package gen;
  public class T_Gen136 {
  		@com.google.inject.Inject
  		public T_Gen136(T_Gen137 t_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  