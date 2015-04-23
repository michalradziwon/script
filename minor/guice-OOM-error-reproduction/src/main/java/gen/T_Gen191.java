
  package gen;
  public class T_Gen191 {
  		@com.google.inject.Inject
  		public T_Gen191(T_Gen192 t_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  