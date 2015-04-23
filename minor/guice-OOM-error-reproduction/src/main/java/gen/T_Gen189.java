
  package gen;
  public class T_Gen189 {
  		@com.google.inject.Inject
  		public T_Gen189(T_Gen190 t_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  