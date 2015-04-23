
  package gen;
  public class T_Gen163 {
  		@com.google.inject.Inject
  		public T_Gen163(T_Gen164 t_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  