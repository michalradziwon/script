
  package gen;
  public class T_Gen164 {
  		@com.google.inject.Inject
  		public T_Gen164(T_Gen165 t_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  