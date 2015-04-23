
  package gen;
  public class Q_Gen162 {
  		@com.google.inject.Inject
  		public Q_Gen162(Q_Gen163 q_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  