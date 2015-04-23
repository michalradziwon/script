
  package gen;
  public class T_Gen174 {
  		@com.google.inject.Inject
  		public T_Gen174(T_Gen175 t_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  