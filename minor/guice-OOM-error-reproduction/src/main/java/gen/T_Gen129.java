
  package gen;
  public class T_Gen129 {
  		@com.google.inject.Inject
  		public T_Gen129(T_Gen130 t_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  