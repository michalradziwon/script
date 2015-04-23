
  package gen;
  public class T_Gen135 {
  		@com.google.inject.Inject
  		public T_Gen135(T_Gen136 t_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  