
  package gen;
  public class T_Gen33 {
  		@com.google.inject.Inject
  		public T_Gen33(T_Gen34 t_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  