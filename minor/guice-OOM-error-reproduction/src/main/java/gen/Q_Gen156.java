
  package gen;
  public class Q_Gen156 {
  		@com.google.inject.Inject
  		public Q_Gen156(Q_Gen157 q_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  