
  package gen;
  public class T_Gen26 {
  		@com.google.inject.Inject
  		public T_Gen26(T_Gen27 t_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  