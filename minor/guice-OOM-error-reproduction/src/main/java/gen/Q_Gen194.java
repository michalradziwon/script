
  package gen;
  public class Q_Gen194 {
  		@com.google.inject.Inject
  		public Q_Gen194(Q_Gen195 q_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  