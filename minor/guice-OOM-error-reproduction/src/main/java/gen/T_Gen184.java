
  package gen;
  public class T_Gen184 {
  		@com.google.inject.Inject
  		public T_Gen184(T_Gen185 t_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  