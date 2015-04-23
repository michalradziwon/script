
  package gen;
  public class T_Gen60 {
  		@com.google.inject.Inject
  		public T_Gen60(T_Gen61 t_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  