
  package gen;
  public class T_Gen194 {
  		@com.google.inject.Inject
  		public T_Gen194(T_Gen195 t_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  