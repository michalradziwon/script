
  package gen;
  public class M_Gen60 {
  		@com.google.inject.Inject
  		public M_Gen60(M_Gen61 m_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  