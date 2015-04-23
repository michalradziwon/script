
  package gen;
  public class T_Gen183 {
  		@com.google.inject.Inject
  		public T_Gen183(T_Gen184 t_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  